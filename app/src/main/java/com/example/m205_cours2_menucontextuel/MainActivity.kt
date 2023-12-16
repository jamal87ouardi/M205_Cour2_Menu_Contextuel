package com.example.m205_cours2_menucontextuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.myImageView)

        // Enregistrer l'image pour le menu contextuel
        registerForContextMenu(imageView)

        // Gérer le clic long sur l'image
        imageView.setOnLongClickListener {
            // Afficher le menu contextuel
            openContextMenu(it)
            true
        }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu,
        v: View,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_share -> {
                // Gérer l'action de partage
                // Exemple : ouvrir une boîte de dialogue de partage

                return true
            }
            R.id.action_delete -> {
                // Gérer l'action de suppression
                // Exemple : supprimer l'image

                return true
            }
            else -> return super.onContextItemSelected(item)
        }
    }


}