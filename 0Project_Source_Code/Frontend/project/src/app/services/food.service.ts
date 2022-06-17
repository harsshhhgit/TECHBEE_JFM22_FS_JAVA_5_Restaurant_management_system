import { Injectable } from '@angular/core';
import { Foods } from '../shared/models/food';
import { Tag } from '../shared/models/Tag';
@Injectable({
  providedIn: 'root'
})
export class FoodService {

  constructor() { }

  getFoodById(id:number):Foods{
    return this.getAll().find(food => food.id==id)!;
  }

  getAllFoodByTag(tag:string):Foods[]{
    if(tag=='All')
    return this.getAll()
    else
    return this.getAll().filter(food => food.tags?.includes(tag));
  }
  getAllTag():Tag[]{
    return [
      {name: 'All', count:15},
      {name: 'Fastfood', count:10},
      {name: 'Non-veg', count:3},
      {name: 'veg', count:12},
      {name: 'lunch', count:4},
      {name: 'dinner', count:4},
      
    ];
  }
  getAll():Foods[]{
    return[
      {
        id: 6741,
        name: 'Aloo Prantha',
        cookTime: '20-30',
        price: 47,
        favorite: true,
        origins: ['lucknow','delhi'],
        stars: 4,
        imageUrl:'assets/Images/FoodCat/veg/1.jpg',
        tags: ['Fastfood','Pizza','Breakfast','veg'],
      },
      {
        id: 8899,
        name: 'Masala Dosa',
        cookTime: '10-20',
        price: 16,
        favorite: true,
        origins: ['delhi'],
        stars: 4.5,
        imageUrl:'assets/Images/FoodCat/veg/2.jpg',
        tags: ['Fastfood','veg'],
      },
      {
        id: 6224,
        name: 'Poha',
        cookTime: '20-30',
        price: 43,
        favorite: false,
        origins: ['lucknow'],
        stars: 3.5,
        imageUrl:'assets/Images/FoodCat/veg/3.jpg',
        tags: ['Pizza','Breakfast','veg'],
      },
      {
        id: 1965,
        name: 'Sandwich',
        cookTime: '10-20',
        price: 3,
        favorite: false,
        origins: ['dharamshala'],
        stars: 4,
        imageUrl:'assets/Images/FoodCat/veg/4.jpg',
        tags: ['Fastfood','Pizza','veg'],
      },
      {
        id: 5384,
        name: 'Pasta',
        cookTime: '10-20',
        price: 85,
        favorite: true,
        origins: ['mumbai'],
        stars: 4.5,
        imageUrl:'assets/Images/FoodCat/veg/5.jpg',
        tags: ['Fastfood','Pizza','Breakfast','veg'],
      },
      {
        id: 2860,
        name: 'Oats',
        cookTime: '5-10',
        price: 21,
        favorite: true,
        origins: ['indore'],
        stars: 3.5,
        imageUrl:'assets/Images/FoodCat/veg/6.jpg',
        tags: ['Fastfood','Pizza','Breakfast','veg'],
      },
      {
        id: 8240,
        name: 'Idli Sambar',
        cookTime: '10-20',
        price: 32,
        favorite: true,
        origins: ['delhi'],
        stars: 4.5,
        imageUrl:'assets/Images/FoodCat/veg/7.jpg',
        tags: ['Fastfood','Pizza','Breakfast','veg'],
      },
      {
        id: 3023,
        name: 'Avocado Toast',
        cookTime: '10-20',
        price: 10,
        favorite: false,
        origins: ['shimla'],
        stars: 3,
        imageUrl:'assets/Images/FoodCat/veg/8.jpg',
        tags: ['Fastfood','Breakfast','veg'],
      },
      {
        id: 2558,
        name: 'Manchurian',
        cookTime: '20-25',
        price: 13,
        favorite: true,
        origins: ['kanpur','delhi'],
        stars: 4,
        imageUrl:'assets/Images/FoodCat/veg/9.jpg',
        tags: ['Fastfood','lunch','dinner','veg'],
      },
      {
        id: 4840,
        name: 'Kadai Paneer',
        cookTime: '30-40',
        price: 37,
        favorite: false,
        origins: ['lucknow','indore'],
        stars: 4.5,
        imageUrl:'assets/Images/FoodCat/veg/10.jpg',
        tags: ['dinner','lunch','veg'],
      },
      {
        id: 2558,
        name: 'Veg. Biryani',
        cookTime: '20-25',
        price: 13,
        favorite: false,
        origins: ['kolkata','chandigarh'],
        stars: 4.3,
        imageUrl:'assets/Images/FoodCat/veg/11.jpg',
        tags: ['Fastfood','lunch','dinner','veg'],
      },
      {
        id: 4804,
        name: 'Dal Makhani',
        cookTime: '30-40',
        price: 37,
        favorite: true,
        origins: ['delhi','mumbai'],
        stars: 4.5,
        imageUrl:'assets/Images/FoodCat/veg/12.jpg',
        tags: ['lunch','dinner','veg'],
      },
      {
        id: 13,
        name: 'Omlet',
        cookTime: '10-20',
        price: 17,
        favorite: true,
        origins: ['lucknow','chennai'],
        stars: 4,
        imageUrl:'assets/Images/FoodCat/nonveg/1.jpg',
        tags: ['Fastfood','Breakfast','Non-veg'],
      },
      {
        id: 14,
        name: 'Egg Toast',
        cookTime: '20-30',
        price: 20,
        favorite: false,
        origins: ['lucknow','delhi'],
        stars: 3.4,
        imageUrl:'assets/Images/FoodCat/nonveg/4.jpg',
        tags: ['Fastfood','Breakfast','Non-veg'],
      },
      {
        id: 15,
        name: 'Eggs',
        cookTime: '10-20',
        price: 45,
        favorite: false,
        origins: ['lucknow','chandigarh'],
        stars: 3,
        imageUrl:'assets/Images/FoodCat/nonveg/3.jpg',
        tags: ['Non-veg','Breakfast','Non-veg'],
      },
    ];
  }
}
