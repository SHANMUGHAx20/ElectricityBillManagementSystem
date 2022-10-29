import React, { useEffect, useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Paper from '@mui/material/Paper';
import Button from '@mui/material/Button';

export default function Customer() {
    const paperstyle = {padding:'50px 20px' , width:600,margin:'20px auto'}
    const [name,setName] = useState('')
    const [mobileno,setMobileno] = useState('')
    const [email,setEmail] = useState('')
    const [password,setPassword] = useState('')
    const [customer,setCustomer] = useState([])

    const handleClick = (e)=>{
        e.preventDefault()
        const customer = {name,mobileno,email,password}
        console.log(customer)
        fetch("http://localhost:8080/customer/add",{
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(customer)
        }).then(()=>{
            console.log("New Student Added")
        })
            
    
    }

    useEffect(()=>{
        fetch("http://localhost:8080/customer/viewAll")
        .then(res=>res.json())
        .then((result1)=>{
            setCustomer(result1)
        }
        )
    },[])



  return (
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >

    <Paper elevation={4} style={paperstyle}>
        <h1>Register</h1>
     <TextField id="standard-basic" label="Name" variant="standard"
      value={name}  
     onChange={(e)=>setName(e.target.value)}
     /><br/>

      <TextField id="standard-basic" label="Mobile No" variant="standard" 
      value={mobileno}  
      onChange={(e)=>setMobileno(e.target.value)}
      /><br/>
       <TextField id="standard-basic" label="Email:" variant="standard" 
       value={email}  
       onChange={(e)=>setEmail(e.target.value)}
       /><br/>
      <TextField id="standard-basic" label="Password" variant="standard" 
      value={password}  
      onChange={(e)=>setPassword(e.target.value)}
      /><br/><br/>
      <Button variant="outlined" onClick={handleClick}>Submit</Button>

      

      </Paper>

      <h1>Customers</h1>
      <Paper elevation={3} style={paperstyle}>
        {customer.map(customer=>(
            <Paper elevation={6} style={{margin:"10px",padding:"15px",textAlign:"left"}}>
                Id:{customer.id}<br/><br/>
                Name:{customer.name}<br/><br/>
                Mobileno:{customer.mobileno}<br/><br/>
                Email:{customer.email}<br/><br/>
                </Paper>
        ))}
      </Paper>
    </Box>


  );
}
