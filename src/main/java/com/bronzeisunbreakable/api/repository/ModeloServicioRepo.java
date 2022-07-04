package com.bronzeisunbreakable.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ModeloServicioRepo extends JpaRepository<ModeloServicio, Integer> {
   @Query(
           value = "select id, nombre, descripcion, precio from servicio_cat_bck;",
           nativeQuery = true)
   List<ModeloServicio> getServicios();
   @Query(
           value="select id, nombre, descripcion, precio from servicio_cat_bck where id = ?1",
           nativeQuery = true)
   ModeloServicio getServiciosId(Long id);
   @Query(
           value = "select * from img_servicio_cat_bck;",
           nativeQuery = true)
   List<Byte> getImgServicios();
}