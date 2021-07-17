package domain;

public class Post {
    private String id;
    private String ownerId;
    private String imageUrl;
    private int date;
    private String text;
    private boolean canAnchor; /// закрепить запись
    private boolean canDeletePost;
    private boolean canFavourite; ///добавление в закладки.
    private boolean canEdit;
    private boolean canArchive;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

/// + getters/setters

}
