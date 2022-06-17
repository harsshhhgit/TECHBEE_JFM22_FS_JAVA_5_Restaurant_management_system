export class Foods{
    id !: number;
    price !: number;
    imageUrl!: string;
    name !: string;
    favorite : boolean = false;
    stars !: number;
    tags? : string[];
    cookTime !:string;
    origins !:string[];
}