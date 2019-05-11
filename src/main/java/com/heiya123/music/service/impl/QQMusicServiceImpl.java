package com.heiya123.music.service.impl;

import com.heiya123.music.common.RequestHeaders;
import com.heiya123.music.constant.MusicConstant;
import com.heiya123.music.musicEnum.MusicType;
import com.heiya123.music.service.MusicService;
import com.heiya123.music.util.OkHttpUtils;
import com.heiya123.music.vo.Music;
import com.heiya123.music.vo.MusicReqVo;
import com.heiya123.music.vo.QQ.QQLyr;
import com.heiya123.music.vo.QQ.QQMusicBase;
import com.heiya123.music.vo.QQ.QQMusicBase.DataBean.SongBean.ListBean;
import com.heiya123.music.vo.QQ.QQMusicBase.DataBean.SongBean.ListBean.SingerBean;
import com.heiya123.music.vo.QQ.QQMusicVkey;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("QQMusic")
public class QQMusicServiceImpl implements MusicService {


    /**
     * 分页获取歌曲
     */
    @Override
    public List<Music> getMusics(MusicReqVo req) {
        ArrayList<Music> list = new ArrayList<>();
        String url = String
                .format(MusicConstant.QQMUSIC_SEARCH, req.getName(), req.getPageSize(), req.getPageNo());
        QQMusicBase qqMusicBase = OkHttpUtils
                .getRequest(url, RequestHeaders.TENCENTHEADERS, null, QQMusicBase.class);
        List<ListBean> songs = qqMusicBase.getData().getSong().getList();
        for (ListBean song : songs) {
            Music music = new Music();
            //设置歌名
            music.setName(song.getSongname());
            //获取歌手
            List<SingerBean> singers = song.getSinger();
            StringBuilder artist = new StringBuilder();
            for (int i = 0; i < singers.size(); i++) {
                artist.append(singers.get(i).getName());
                if (i != singers.size() - 1) {
                    artist.append("、");
                }
            }
            music.setArtist(artist.toString());
            //设置专辑
            music.setAlbum(song.getAlbumname());
            //设置封面图片ID
            music.setPic_id(song.getAlbummid());
            //设置音乐链接ID
            music.setUrl_id(song.getMedia_mid());
            music.setId(song.getMedia_mid());
            //设置歌词ID */
            music.setLyric_id(song.getMedia_mid());
            List<String> rates = new ArrayList<>();
            if (song.getSize128() > 0) {
                rates.add("128");
            } else if (song.getSize320() > 0) {
                rates.add("320");
            } else if (song.getSizeape() > 0) {
                rates.add("ape");
            } else if (song.getSizeflac() > 0) {
                rates.add("flac");
            }
            music.setAllRate(StringUtils.join(rates, ","));
            music.setType(MusicType.QQ);
            list.add(music);
        }
        return list;
    }


    /**
     * 获取歌曲URL
     */
    @Override
    public String getMusicUrl(String media_mid, String bit) {
        String uin = "1008611";
        String guid = "1234567890";
        String url = String.format(MusicConstant.QQMUSIC_REQ_URL, uin, uin, guid);
        QQMusicVkey qqMusicVkey = OkHttpUtils
                .getRequest(url, RequestHeaders.TENCENTHEADERS, null, QQMusicVkey.class);
        return String.format(MusicConstant.QQMUSIC_URL, media_mid,
                qqMusicVkey.getData().getItems().get(0).getVkey());
    }

    /**
     * 获取封面图片
     */
    @Override
    public String getPic(String albummid) {
        return String.format(MusicConstant.QQMUSIC_PIC, albummid
                .substring(albummid.length() - 2, albummid.length() - 1), albummid
                .substring(albummid.length() - 1), albummid);
    }

    /**
     * 获取歌词
     */
    @Override
    public String getLyric(String media_mid) {
        String lyr = "";
        String url = String.format(MusicConstant.QQMUSIC_LYRIC, media_mid);
        QQLyr qqLyr = OkHttpUtils.getRequest(url, RequestHeaders.TENCENTHEADERS, null, QQLyr.class);
        if (qqLyr != null && qqLyr.getLyric() != null) {
            lyr = qqLyr.getLyric().replace("&#58;", ":").replace("&#46;", ":").replace("&#10;", "\n")
                    .replace("&#32;",
                            " ").replace("&#45;", "").replace("&#13", "");
        }
        return lyr;
    }
}
