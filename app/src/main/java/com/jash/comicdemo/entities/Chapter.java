package com.jash.comicdemo.entities;

import android.content.Context;
import android.content.Intent;
import android.databinding.ObservableInt;

import com.jash.comicdemo.activities.PictureActivity;
import com.jash.comicdemo.utils.ObservableIntConvert;

import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Chapter {
    @Id
    private long id;
    private long comicId;
    private String name;
    private int picCount;
    @Convert(converter = ObservableIntConvert.class, columnType = Integer.class)
    private ObservableInt lastPosition = new ObservableInt(0);
    @Generated(hash = 1082531298)
    public Chapter(long id, long comicId, String name, int picCount,
            ObservableInt lastPosition) {
        this.id = id;
        this.comicId = comicId;
        this.name = name;
        this.picCount = picCount;
        this.lastPosition = lastPosition;
    }
    @Generated(hash = 393170288)
    public Chapter() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getComicId() {
        return this.comicId;
    }
    public void setComicId(long comicId) {
        this.comicId = comicId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chapter chapter = (Chapter) o;

        return id == chapter.id;

    }

    public void showPicture(Context context) {
        Intent intent = new Intent(context, PictureActivity.class);
        intent.putExtra("chapterId", id);
        context.startActivity(intent);
    }
    public int getPicCount() {
        return this.picCount;
    }
    public void setPicCount(int picCount) {
        this.picCount = picCount;
    }
    public ObservableInt getLastPosition() {
        return this.lastPosition;
    }
    public void setLastPosition(ObservableInt lastPosition) {
        this.lastPosition = lastPosition;
    }
}
