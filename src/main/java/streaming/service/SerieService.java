/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
@Service
public interface SerieService extends CrudRepository<Serie, Long>{

   
    
}
