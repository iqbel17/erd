/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import controllers.AnggotaController;
import entities.Anggota;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Ignatius
 */
public class ManualTester {

    public static void main(String[] args) {
       Connection connection = new MyConnection().getConnection();
      //  System.out.println(new MyConnection().getConnection());
//        String countryId = "KS";
//        String countryName = "Korea Selatan";
//        int regionId = 3;
     //   String countryId = "TT";
     //   String countryName = "Timor Timur";
     //   int regionId = 3;
   //     System.out.println(countryController.edit());
//        System.out.println(countryController.drop(countryId));
//        for (Country country : countryController.binding()) {
//            System.out.println(country.getCountryId()+" - "+country.getCountryName()+" - "+region.getRegionId);
//        }
//        System.out.println("pakai sort");
//        regionController.binding("region_id", "desc").forEach((region) -> {
//            System.out.println(region.getRegionId()+" - "+region.getRegionName());
//        });
//        regionController.find("region_name", "a").forEach((region)->{
//            System.out.println(region.getRegionId()+" - "+region.getRegionName());
//        });
//        System.out.println(countryController.findBy("ML"));

//        System.out.println((char)48);
//        System.out.println((char)57);

//        String agt = "A06";
//        String nm = "coba";
//
//        String tel = "081921423";
//        String alamat = "Jl Tanjung duren ";
//
//        AnggotaController anggotaController = new AnggotaController(connection);
//        System.out.println(anggotaController.save(agt, nm, tel, alamat));
//
       // System.out.println(anggotaController.save(agt, nm, JK, tel, alamat));
      //  System.out.println(anggotaController.edit(agt, nm, JK, tel, alamat));
        //System.out.println(anggotaController.drop(agt));
//          for (Anggota: anggotaController.binding()) {
//          System.out.println(anggota.);
//        }

  //   System.out.println(anggotaController.findbyId("AG01"));
//  for (Anggota anggota : anggotaController.binding()) {
//        System.out.println(anggota.getKdAnggota()+" - "+anggota.getNmAnggota()+" - "+anggota.getJK()+"-"+anggota.getTelepon()+"-"+anggota.getAlamat());
//      }
    }
    
}
