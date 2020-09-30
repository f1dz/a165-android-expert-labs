package com.dicoding.mysimplelogin.chat

import `in`.khofid.core.SessionManager
import `in`.khofid.core.UserRepository
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val sesi = SessionManager(this)
        val userRepository = UserRepository.getInstance(sesi)
        tv_chat.text = "Hello ${userRepository.getUser()}! \n Welcome to Chat Feature"
    }
}