package com.pbmt.s_news.db

import androidx.room.TypeConverter
import com.pbmt.s_news.other.Source

class Converters {
    @TypeConverter
    fun  fromSource(source: Source): String{
        return source.name
    }
    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name,name)
    }
}