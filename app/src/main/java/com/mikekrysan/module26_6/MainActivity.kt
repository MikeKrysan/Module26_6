package com.mikekrysan.module26_6

import android.annotation.SuppressLint
import android.content.Intent
import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button_get_contact.setOnClickListener {
//            val intent =
//                Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI)
//            startActivityForResult(intent, 0)
//        }

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }

//    @SuppressLint("Range")
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (data == null) {
//            return
//        } else {
//            val uri: Uri = data.data!!
//
//            val cursor: Cursor? = contentResolver.query(uri, null, null, null, null)
//
//            cursor?.moveToFirst()
//            val name =
//                cursor?.getString(cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME))
//
//            cursor?.moveToFirst()
//            val number =
//                cursor?.getString(cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
//
//            cursor?.close()
//
//            val contact = "$name $number"
//            contact_text.text = contact
//
//        }
//    }


}


