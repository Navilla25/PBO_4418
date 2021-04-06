/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Navilla
 */
public class Data {
    int datalist [] = new int [5];
}
class ArrayList extends Data{
    public void append(int data){
        for (int x = 0; x < datalist.length; x++){
            if (datalist[x] == 0){
                datalist[x] = data;
                break;
            }
        }
    }
    public void append(int idx, int data){
        datalist[idx] = data;
    }
    public void pop(){
        for (int x = datalist.length-1; x > 0; x--){
            if (datalist[x] != 0){
                datalist[x] = 0;
                break;
            }
        }
    }
    public void pop(int idx){
        datalist[idx] = 0;
    }
    public void UbahData(int idx, int data){
        datalist[idx] = data;
    }
    public void ShowData(){
        for (int x = 0; x < datalist.length;x++){
            System.out.println(datalist[x]);
        }
    }
}
