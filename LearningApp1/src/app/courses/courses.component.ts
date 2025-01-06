import { Component } from '@angular/core';
import { Course } from './courses.model';
import { CoursesService } from './courses.service';

@Component({
  selector: 'app-courses',
  imports: [],
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.css'
})
export class CoursesComponent {

  title = 'List Courses';
  courseList: Course[];

 

  constructor(private courseService: CoursesService) {

    
    this.courseList = courseService.getCourses();
  }

}
