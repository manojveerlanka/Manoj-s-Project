import { Component } from '@angular/core';
import { Course } from './courses.model';

@Component({
  selector: 'app-courses',
  imports: [],
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.css'
})
export class CoursesComponent {

  title = 'List Courses';
  courseList: Course[];

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

}
