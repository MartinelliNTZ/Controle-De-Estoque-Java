package com.example.controle_de_estoque_java.my_codes;
import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;

public class CustomKeyBoard {
    /*--------------------------ABRE E FECHA TECLADO-----------------------------------*/
    /**
     * @param context getAplicationContext ou getContext ou this
     * @param textInputEditText imput que ira receber o foco
    *PARA ABRIR O TECLADO É NECESSARIO PASSAR O EDITtEXT QUE VAI RECEBER FOCO
     * */
    public static void keyboardShow(Context context, TextInputEditText textInputEditText) {
        textInputEditText.requestFocus();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_NOT_ALWAYS);
    }
    /**
     * @param context getAplicationContext ou getContext ou this
     * @param editText imput que ira receber o foco
     *PARA ABRIR O TECLADO É NECESSARIO PASSAR O EDITtEXT QUE VAI RECEBER FOCO
     * */
    public static void keyboardShow(Context context, EditText editText) {
        editText.requestFocus();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_NOT_ALWAYS);
    }
    /**
     * @param context getAplicationContext ou getContext ou this
     *Fecha o teclado
     * */
    public static void keyboardHidenn(Context context){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        if(imm.isActive())
            imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }
}
