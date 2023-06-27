package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapter.ProductAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.retrofit.MainApi
import com.example.myapplication.retrofit.PeredachaData
import com.squareup.picasso.Picasso
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: ProductAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ProductAdapter()

        binding.rcView.layoutManager = LinearLayoutManager(this)
        binding.rcView.adapter = adapter
        adapter.submitList()

          binding.baton.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                val interceptor = HttpLoggingInterceptor()
                interceptor.level = HttpLoggingInterceptor.Level.BODY

                val client = OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .build()

                val retrofit = Retrofit.Builder()
                    .baseUrl("https://dummyjson.com").client(client)
                    .addConverterFactory(GsonConverterFactory.create()).build()
                val mainApi = retrofit.create(MainApi::class.java)
                //делаем поток, что б не тормозил в основном потоке
                val user = mainApi.peredacha(
                    PeredachaData(
                        binding.User.text.toString(),
                        binding.Password.text.toString()
                    )
                )
                //запускаем обновление на основном потоке
                withContext(Dispatchers.Main){
                    binding.apply { //что бы каждый раз не писать binding
                        Picasso.get().load(user.image).into(binding.fox)
                        firstname.text = user.firstName
                        lastname.text = user.lastName
                    }

                }
        }


        }
    }
}