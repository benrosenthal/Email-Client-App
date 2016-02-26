package com.example.gmailquickstart;

/**
 * Created by User_1_Benjamin_Rosenthal on 2/26/16.
 */
public class Email {

    private int mSenderImageResource;
    private int mFavoriteImageResource;
    private int mAttachmentImageResource;
    private String mItemTitle;
    private String mItemContent;
    private String mItemTime;
    private String mItemTag;

    public Email(int senderImageResource, int favoriteImageResource, int attachmentImageResource, String itemTitle, String itemContent, String itemTime, String itemTag) {
        mSenderImageResource = senderImageResource;
        mFavoriteImageResource = favoriteImageResource;
        mAttachmentImageResource = attachmentImageResource;
        mItemTitle = itemTitle;
        mItemContent = itemContent;
        mItemTime = itemTime;
        mItemTag = itemTag;
    }

    //Idea is that this constrcutor 
    public Email(int senderImageResource, String itemTime, String itemContent, String itemTitle) {
        mSenderImageResource = senderImageResource;
        mItemTime = itemTime;
        mItemContent = itemContent;
        mItemTitle = itemTitle;
    }

    public int getSenderImageResource() {
        return mSenderImageResource;
    }

    public void setSenderImageResource(int senderImageResource) {
        mSenderImageResource = senderImageResource;
    }

    public int getFavoriteImageResource() {
        return mFavoriteImageResource;
    }

    public void setFavoriteImageResource(int favoriteImageResource) {
        mFavoriteImageResource = favoriteImageResource;
    }

    public int getAttachmentImageResource() {
        return mAttachmentImageResource;
    }

    public void setAttachmentImageResource(int attachmentImageResource) {
        mAttachmentImageResource = attachmentImageResource;
    }

    public String getItemTitle() {
        return mItemTitle;
    }

    public void setItemTitle(String itemTitle) {
        mItemTitle = itemTitle;
    }

    public String getItemContent() {
        return mItemContent;
    }

    public void setItemContent(String itemContent) {
        mItemContent = itemContent;
    }

    public String getItemTime() {
        return mItemTime;
    }

    public void setItemTime(String itemTime) {
        mItemTime = itemTime;
    }

    public String getItemTag() {
        return mItemTag;
    }

    public void setItemTag(String itemTag) {
        mItemTag = itemTag;
    }
}
    
    

