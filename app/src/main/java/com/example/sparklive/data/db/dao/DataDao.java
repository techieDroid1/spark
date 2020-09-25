package com.example.sparklive.data.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.sparklive.data.db.entities.DataEntity;

import java.util.List;

@Dao
public interface DataDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertData(DataEntity dataEntity);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAllData(List<DataEntity> dataEntity);

    @Query("SELECT COUNT(*) FROM data_table")
    int numberOfEntries();

    @Query("SELECT * FROM data_table")
    List<DataEntity> getAllData();

    @Query("UPDATE data_table SET is_liked =:isLiked WHERE id = :id")
    int updateLike(int id, boolean isLiked);

    @Query("UPDATE data_table SET likes =:likesUpdated WHERE id = :id")
    int updateLikeCount(int id, String likesUpdated);
}
