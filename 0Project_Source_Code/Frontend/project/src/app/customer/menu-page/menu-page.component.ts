import { Component, OnInit } from '@angular/core';
import { FoodService } from '../../services/food.service';
import {Foods} from '../../shared/models/food';
import {ActivatedRoute, Router} from '@angular/router';
import { CartService } from '../../services/cart.service';
import { identifierName } from '@angular/compiler';
import { StarRatingComponent } from 'ng-starrating';

@Component({
  selector: 'app-menu-page',
  templateUrl: './menu-page.component.html',
  styleUrls: ['./menu-page.component.css']
})
export class MenuPageComponent implements OnInit {
foods:Foods[]=[];

  constructor(private fs:FoodService, private route:ActivatedRoute, private cartService:CartService, private router:Router) {
    
   }

  ngOnInit(): void {
    
    this.route.params.subscribe(params =>{
      if(params['searchItem'])
      this.foods=this.fs.getAll().filter(food =>food.name.toLowerCase().includes(params['searchItem'].toLowerCase()));
      else if(params['tag'])
      this.foods =  this.fs.getAllFoodByTag(params['tag'])
      else
      this.foods =  this.foods= this.fs.getAll();
    })
  }
  

}
