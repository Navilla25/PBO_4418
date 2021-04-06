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
class Queue extends Data{
    public void append(int data){
        try{
            for (int x = 0; x < datalist.length+1;x++){
                if (datalist[x] == 0){
                    datalist[x] = data;
                    break;
                }
                if (x == datalist.length+1){
                    throw new Exception("");
                }
            }
        }catch (Exception c){
            int len = datalist.length;
            int node[] = new int[len+1];
            for (int x = 0; x < len;x++){
                node[x] = datalist[x];
            }
            node[len] = data;
            datalist = node.clone();
        }
    }
    public void pop(){
        int len = datalist.length;
        int node[] = new int[len-1];
        for (int i = 0; i < node.length; i++){
            node[i] = datalist[i+1];
        }
        datalist = node.clone();
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
