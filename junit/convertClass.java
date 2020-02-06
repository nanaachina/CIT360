/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package junit;

/**
 *
 * @author adm-achina
 */
public class convertClass {

    public static Double convertToDouble(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }
    public static boolean isNullOrBlank(String st) {
        return st == null || st.trim().length() == 0;
    }
    public static String getDefaultIfNull(final String st, final String defaultSt) {
        return st == null ? defaultSt : st;
    }

}
