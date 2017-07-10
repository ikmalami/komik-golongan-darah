/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalpraktikum;

/**
 *
 * @author Asus
 */
class Golongan {
    private String Deskripsi;
    private String Logo;
    private String Judul;

    public Golongan(String Judul, String Deskripsi, String Logo) {
        this.Deskripsi = Deskripsi;
        this.Logo = Logo;
        this.Judul = Judul;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public String getLogo() {
        return Logo;
    }

    public String getJudul() {
        return Judul;
    }

}
