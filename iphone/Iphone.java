package iphone;

import iphone.cellPhone.CellPhone;

public class Iphone {
    public static void main(String[] args) {

        CellPhone iphone = new CellPhone();
        iphone.ligar();
        iphone.desligar();
        iphone.reiniciar();
        
        iphone.phone.call(119842235);
        iphone.phone.answerCall();
        iphone.phone.voiceMail();
        
        iphone.browser.printPage("www.google.com");
        iphone.browser.newTab();
        iphone.browser.refreshPage();

        iphone.player.musicSelection("Metallica_One.mp3");
        iphone.player.play();
        iphone.player.pause();
    }
}
