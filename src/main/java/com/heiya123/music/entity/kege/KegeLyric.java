package com.heiya123.music.entity.kege;


import com.alibaba.fastjson.annotation.JSONField;

public class KegeLyric {
    /**
     * code : 0
     * data : {"adjust":0,"lyric":"[ti:凉凉 (《三生三世十里桃花》电视剧片尾曲)] [ar:杨宗纬/张碧晨] [al:凉凉] [by:] [offset:0] [00:48.09]女：入夜渐微凉 [00:49.93]女：繁花落地成霜 [00:52.67]女：你在远方眺望 [00:55.21]女：耗尽所有暮光 [00:57.53] [00:58.26]女：不思量自难相忘 [01:04.33] [01:09.21]男：夭夭桃花凉 [01:10.90] [01:11.47]男：前世你怎舍下 [01:13.95]男：这一海心茫茫 [01:16.62]男：还故作不痛不痒不牵强 [01:20.35] [01:24.13]男：都是假象 [01:27.08] [01:30.62]女：凉凉夜色为你思念成河 [01:34.29] [01:35.98]女：化作春泥呵护着我 [01:39.13] [01:41.40]男：浅浅岁月拂满爱人袖 [01:44.68] [01:45.72]男：片片芳菲入水流 [01:50.22] [01:51.90]女：凉凉天意潋滟一身花色 [01:55.65] [01:57.27]女：落入凡尘伤情着我 [02:00.41] [02:02.66]男：生劫易渡情劫难了 [02:05.16]男：折旧的心还有几分前生的恨 [02:10.82] [02:13.42]男：还有几分 [02:16.07] [02:17.27]合：前生的恨 [02:20.21] [02:42.80]女：也曾鬓微霜 [02:44.58]女：也曾因你回光 [02:47.30]女：悠悠岁月漫长 [02:49.94]女：怎能浪费时光 [02:52.70]女：去流浪 [02:53.80]男：去流浪 [02:55.02] [02:57.34]女：去换成长 [02:59.59] [03:04.00]男：灼灼桃花凉 [03:05.61] [03:06.13]男：今生愈渐滚烫 [03:08.66]男：一朵已放心上 [03:11.27]男：足够三生三世背影成双 [03:15.04] [03:16.00]女：背影成双 [03:17.28] [03:18.56]男：在水一方 [03:21.02] [03:25.37]女：凉凉夜色为你思念成河 [03:28.93] [03:30.68]女：化作春泥呵护着我 [03:34.13] [03:35.95]男：浅浅岁月拂满爱人袖 [03:39.32] [03:40.39]男：片片芳菲入水流 [03:45.38] [03:46.75]女：凉凉天意潋滟一身花色 [03:50.24] [03:51.98]女：落入凡尘伤情着我 [03:55.34] [03:57.27]男：生劫易渡情劫难了 [03:59.80]男：折旧的心还有几分前生的恨 [04:05.73] [04:16.09]女：凉凉三生三世恍然如梦 [04:19.64] [04:21.20]女：须臾的年风干泪痕 [04:24.92] [04:26.66]男：若是回忆不能再相认 [04:30.01] [04:30.97]男：就让情分落九尘 [04:35.91] [04:37.28]女：凉凉十里何时还会春盛 [04:40.99] [04:42.65]女：又见树下一盏风存 [04:46.23] [04:47.90]男：落花有意流水无情 [04:50.70]男：别让恩怨爱恨凉透那花的纯 [04:56.94] [05:01.49]合：吾生愿牵尘"}
     * default : 0
     * message :
     * subcode : 0
     */

    private int code;
    private DataBean data;
    @JSONField(name = "default")
    private int defaultX;
    private String message;
    private int subcode;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getDefaultX() {
        return defaultX;
    }

    public void setDefaultX(int defaultX) {
        this.defaultX = defaultX;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSubcode() {
        return subcode;
    }

    public void setSubcode(int subcode) {
        this.subcode = subcode;
    }

    public static class DataBean {
        /**
         * adjust : 0
         * lyric : [ti:凉凉 (《三生三世十里桃花》电视剧片尾曲)] [ar:杨宗纬/张碧晨] [al:凉凉] [by:] [offset:0] [00:48.09]女：入夜渐微凉 [00:49.93]女：繁花落地成霜 [00:52.67]女：你在远方眺望 [00:55.21]女：耗尽所有暮光 [00:57.53] [00:58.26]女：不思量自难相忘 [01:04.33] [01:09.21]男：夭夭桃花凉 [01:10.90] [01:11.47]男：前世你怎舍下 [01:13.95]男：这一海心茫茫 [01:16.62]男：还故作不痛不痒不牵强 [01:20.35] [01:24.13]男：都是假象 [01:27.08] [01:30.62]女：凉凉夜色为你思念成河 [01:34.29] [01:35.98]女：化作春泥呵护着我 [01:39.13] [01:41.40]男：浅浅岁月拂满爱人袖 [01:44.68] [01:45.72]男：片片芳菲入水流 [01:50.22] [01:51.90]女：凉凉天意潋滟一身花色 [01:55.65] [01:57.27]女：落入凡尘伤情着我 [02:00.41] [02:02.66]男：生劫易渡情劫难了 [02:05.16]男：折旧的心还有几分前生的恨 [02:10.82] [02:13.42]男：还有几分 [02:16.07] [02:17.27]合：前生的恨 [02:20.21] [02:42.80]女：也曾鬓微霜 [02:44.58]女：也曾因你回光 [02:47.30]女：悠悠岁月漫长 [02:49.94]女：怎能浪费时光 [02:52.70]女：去流浪 [02:53.80]男：去流浪 [02:55.02] [02:57.34]女：去换成长 [02:59.59] [03:04.00]男：灼灼桃花凉 [03:05.61] [03:06.13]男：今生愈渐滚烫 [03:08.66]男：一朵已放心上 [03:11.27]男：足够三生三世背影成双 [03:15.04] [03:16.00]女：背影成双 [03:17.28] [03:18.56]男：在水一方 [03:21.02] [03:25.37]女：凉凉夜色为你思念成河 [03:28.93] [03:30.68]女：化作春泥呵护着我 [03:34.13] [03:35.95]男：浅浅岁月拂满爱人袖 [03:39.32] [03:40.39]男：片片芳菲入水流 [03:45.38] [03:46.75]女：凉凉天意潋滟一身花色 [03:50.24] [03:51.98]女：落入凡尘伤情着我 [03:55.34] [03:57.27]男：生劫易渡情劫难了 [03:59.80]男：折旧的心还有几分前生的恨 [04:05.73] [04:16.09]女：凉凉三生三世恍然如梦 [04:19.64] [04:21.20]女：须臾的年风干泪痕 [04:24.92] [04:26.66]男：若是回忆不能再相认 [04:30.01] [04:30.97]男：就让情分落九尘 [04:35.91] [04:37.28]女：凉凉十里何时还会春盛 [04:40.99] [04:42.65]女：又见树下一盏风存 [04:46.23] [04:47.90]男：落花有意流水无情 [04:50.70]男：别让恩怨爱恨凉透那花的纯 [04:56.94] [05:01.49]合：吾生愿牵尘
         */

        private int adjust;
        private String lyric;

        public int getAdjust() {
            return adjust;
        }

        public void setAdjust(int adjust) {
            this.adjust = adjust;
        }

        public String getLyric() {
            return lyric;
        }

        public void setLyric(String lyric) {
            this.lyric = lyric;
        }
    }
}
