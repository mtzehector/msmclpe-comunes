/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.dpes.interfaces.captcha.model;

import lombok.Getter;
import lombok.Setter;
import mx.gob.imss.dpes.common.model.BaseModel;

/**
 *
 * @author juan.garfias
 */

 public class Captcha extends BaseModel {

    private static final long serialVersionUID = 6279783209297326920L;
    @Getter @Setter private String captchaValueEncrypted;
    @Getter @Setter private String captchaImageInBase64;

    public Captcha(String captchaValueEncrypted, String captchaImageInBase64) {
        this.captchaValueEncrypted = captchaValueEncrypted;
        this.captchaImageInBase64 = captchaImageInBase64;
    }

    public Captcha() {
    }
    
    
}

