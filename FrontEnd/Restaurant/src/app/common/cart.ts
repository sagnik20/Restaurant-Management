import { Customer } from "./customer";
import { Item } from "./item";

export class Cart {

    cartId !:Number;
    customer !: Customer;
    item !: Item;
    iQty !: Number;
}
