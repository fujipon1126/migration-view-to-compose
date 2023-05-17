package com.example.migrationViewToCompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.migrationViewToCompose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        // アクションバーにナビゲーションサポート追加
        val topFragments = setOf(R.id.main_fragment) // ここにあると戻るボタンが出ない
        val configuration = AppBarConfiguration(topFragments)
        this.setupActionBarWithNavController(navController, configuration)

    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
    fun navigateTo(fragmentId: Int) {
        val navigation = Navigation.findNavController(this, R.id.nav_host_fragment)
        navigation.navigate(fragmentId)
    }
}