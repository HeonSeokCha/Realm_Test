package com.chs.realmtest

import android.app.Application
import com.chs.realmtest.model.Address
import com.chs.realmtest.model.Course
import com.chs.realmtest.model.Student
import com.chs.realmtest.model.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class RealmTestApp : Application() {

    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }
}