import { Injectable } from '@angular/core';
import { Course } from './courses.model';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {
  
private courseList : Course[];
  constructor() { 
this.courseList = [


  {
    id: 1,
    name: 'Angular',
    description: 'Angular Course',
    price: 100
  },
  {
    id: 2,
    name: 'React',
    description: 'React Course',
    price: 200
  },
  {
    id: 3,
    name: 'Vue',
    description: 'Vue Course',
    price: 300
  }
];


  }
  getCourses(): Course[] {
    return this.courseList;
  }
}
