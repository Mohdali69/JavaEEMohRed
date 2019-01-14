/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur.actions;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Admin
 */
public abstract class Action {
    public abstract String execute (HttpServletRequest request);
}
