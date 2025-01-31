import express from 'express';

import healthRoutes from '../modules/health/health.routes';

/* Creating a new router object. */
const router = express.Router();

/* Telling the router to use the healthRoutes object when the url is /health-check. */
router.use('/health-check', healthRoutes);

export default router;
