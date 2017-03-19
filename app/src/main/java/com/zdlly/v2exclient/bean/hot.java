package com.zdlly.v2exclient.bean;

import java.io.Serializable;

/**
 * Created by zdlly on 2017/3/16.
 */

public class hot implements Serializable{

    /**
     * id : 347669
     * title : 你们有没有为一个类或表取名发愁过？
     * url : http://www.v2ex.com/t/347669
     * content :
     * content_rendered :
     * replies : 96
     * member : {"id":85913,"username":"a1310747","tagline":"","avatar_mini":"//v2ex.assets.uxengine.net/avatar/bc94/2c81/85913_mini.png?m=1418265824","avatar_normal":"//v2ex.assets.uxengine.net/avatar/bc94/2c81/85913_normal.png?m=1418265824","avatar_large":"//v2ex.assets.uxengine.net/avatar/bc94/2c81/85913_large.png?m=1418265824"}
     * node : {"id":300,"name":"programmer","title":"程序员","title_alternative":"Programmer","url":"http://www.v2ex.com/go/programmer","topics":14965,"avatar_mini":"//v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_mini.png?m=1489386188","avatar_normal":"//v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_normal.png?m=1489386188","avatar_large":"//v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_large.png?m=1489386188"}
     * created : 1489567235
     * last_modified : 1489567235
     * last_touched : 1489647208
     */

    private int id;
    private String title;
    private String url;
    private String content;
    private String content_rendered;
    private int replies;
    private MemberBean member;
    private NodeBean node;
    private int created;
    private int last_modified;
    private int last_touched;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent_rendered() {
        return content_rendered;
    }

    public void setContent_rendered(String content_rendered) {
        this.content_rendered = content_rendered;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public MemberBean getMember() {
        return member;
    }

    public void setMember(MemberBean member) {
        this.member = member;
    }

    public NodeBean getNode() {
        return node;
    }

    public void setNode(NodeBean node) {
        this.node = node;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getLast_modified() {
        return last_modified;
    }

    public void setLast_modified(int last_modified) {
        this.last_modified = last_modified;
    }

    public int getLast_touched() {
        return last_touched;
    }

    public void setLast_touched(int last_touched) {
        this.last_touched = last_touched;
    }

    public static class MemberBean {
        /**
         * id : 85913
         * username : a1310747
         * tagline :
         * avatar_mini : //v2ex.assets.uxengine.net/avatar/bc94/2c81/85913_mini.png?m=1418265824
         * avatar_normal : //v2ex.assets.uxengine.net/avatar/bc94/2c81/85913_normal.png?m=1418265824
         * avatar_large : //v2ex.assets.uxengine.net/avatar/bc94/2c81/85913_large.png?m=1418265824
         */

        private int id;
        private String username;
        private String tagline;
        private String avatar_mini;
        private String avatar_normal;
        private String avatar_large;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getTagline() {
            return tagline;
        }

        public void setTagline(String tagline) {
            this.tagline = tagline;
        }

        public String getAvatar_mini() {
            return avatar_mini;
        }

        public void setAvatar_mini(String avatar_mini) {
            this.avatar_mini = avatar_mini;
        }

        public String getAvatar_normal() {
            return avatar_normal;
        }

        public void setAvatar_normal(String avatar_normal) {
            this.avatar_normal = avatar_normal;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }
    }

    public static class NodeBean {
        /**
         * id : 300
         * name : programmer
         * title : 程序员
         * title_alternative : Programmer
         * url : http://www.v2ex.com/go/programmer
         * topics : 14965
         * avatar_mini : //v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_mini.png?m=1489386188
         * avatar_normal : //v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_normal.png?m=1489386188
         * avatar_large : //v2ex.assets.uxengine.net/navatar/94f6/d7e0/300_large.png?m=1489386188
         */

        private int id;
        private String name;
        private String title;
        private String title_alternative;
        private String url;
        private int topics;
        private String avatar_mini;
        private String avatar_normal;
        private String avatar_large;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle_alternative() {
            return title_alternative;
        }

        public void setTitle_alternative(String title_alternative) {
            this.title_alternative = title_alternative;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getTopics() {
            return topics;
        }

        public void setTopics(int topics) {
            this.topics = topics;
        }

        public String getAvatar_mini() {
            return avatar_mini;
        }

        public void setAvatar_mini(String avatar_mini) {
            this.avatar_mini = avatar_mini;
        }

        public String getAvatar_normal() {
            return avatar_normal;
        }

        public void setAvatar_normal(String avatar_normal) {
            this.avatar_normal = avatar_normal;
        }

        public String getAvatar_large() {
            return avatar_large;
        }

        public void setAvatar_large(String avatar_large) {
            this.avatar_large = avatar_large;
        }
    }
}
