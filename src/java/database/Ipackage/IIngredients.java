/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Ipackage;

import java.sql.Connection;
import java.util.List;
import metier.Ingredients;

/**
 *
 * @author Asus
 */
public interface IIngredients {
    
    public void setConnection(Connection c);
    
    public void setDataSource(javax.sql.DataSource ds);
    
    public List<Ingredients> getIngredients();   
}
