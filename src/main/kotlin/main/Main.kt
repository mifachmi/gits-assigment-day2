package main

import java.util.*

fun hitungLuasPersegi() {
    print("Masukkan panjang sisi (s): ")
    val sisi = readLine()?.toFloat()
    val hitungLuas = sisi?.times(sisi)
    println("Luas persegi dengan s($sisi) = $hitungLuas")
}

fun hitungLuasPersegiPanjang() {
    print("Masukkan panjang (p): ")
    val panjang = readLine()?.toFloat()
    print("Masukkan lebar (l): ")
    val lebar = readLine()?.toFloat()
    val hitungLuas = panjang?.times(lebar!!)
    println("Luas persegi panjang dengan p($panjang) dan l($lebar) = $hitungLuas")
}

fun hitungLuasLingkaran() {
    print("Masukkan radius (r): ")
    val radius = readLine()?.toFloat()
    val hitungLuas = 4*Math.PI* (radius?.times(radius)!!)
    println("Luas lingkaran dengan r($radius) = %.3f".format(hitungLuas))
}

fun pengecekanMenu(input: Int){
    if (input == 1) {
        hitungLuasPersegi()
    } else if (input == 2) {
        hitungLuasPersegiPanjang()
    } else if (input == 3) {
        hitungLuasLingkaran()
    } else {
        println("tidak ada menu yang tersedia")
        return
    }
}

fun menuHitungLuas(): Int {
    println("Aplikasi Hitung Luas\n")
    println("1. Persegi")
    println("2. Persegi Panjang")
    println("3. Lingkaran")
    print("\nPilih opsi: ")
    return readLine()?.toInt()!!
}

fun main() {
    do {
        val pilihOpsi = menuHitungLuas()
        pengecekanMenu(pilihOpsi)

        print("\nApakah ingin mencoba lagi(y/n)? ")
        val scanner = Scanner(System.`in`)
        val decision = scanner.next().single()
        print("\n")
    } while (decision == 'y' || decision == 'Y')
}