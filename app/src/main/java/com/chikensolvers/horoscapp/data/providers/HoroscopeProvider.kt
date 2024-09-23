package com.chikensolvers.horoscapp.data.providers

import com.chikensolvers.horoscapp.domain.model.HoroscopeInfo
import com.chikensolvers.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Piscis
        )
    }
}