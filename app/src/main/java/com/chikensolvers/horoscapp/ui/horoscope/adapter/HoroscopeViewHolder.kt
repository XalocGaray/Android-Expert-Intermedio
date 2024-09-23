package com.chikensolvers.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.chikensolvers.horoscapp.databinding.ItemHoroscopeBinding
import com.chikensolvers.horoscapp.domain.model.HoroscopeInfo


class HoroscopeViewHolder(view:View):RecyclerView.ViewHolder(view){

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){

        binding.ivHoroscope.setImageResource(horoscopeInfo.img)

        //This is my option
        binding.tvTitle.setText(horoscopeInfo.name)

        //This is Aristidev option
        //val context = binding.tvTitle.context
        //binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener{
            startRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
            //onItemSelected(horoscopeInfo)
        }
    }

    private fun startRotationAnimation(view:View, newLambda:()->Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction {  newLambda() }
            start()
        }
    }
}