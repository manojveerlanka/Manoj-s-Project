import { Component } from '@angular/core';

@Component({
  selector: 'app-courses',
  imports: [],
  templateUrl: './courses.component.html',
  styleUrl: './courses.component.css'
})
export class CoursesComponent {

  title = 'List Courses';
  courseList: string[];

  constructor() {
    this.courseList = ['Angular', 'React', 'Vue'];
  }

}
