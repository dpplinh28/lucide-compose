package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HopOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.82f, 16.12f)
                curveToRelative(1.69f, .6f, 3.91f, .79f, 5.18f, .85f)
                curveToRelative(.28f, .01f, .53f, -.09f, .7f, -.27f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.14f, 20.57f)
                curveToRelative(.52f, .24f, 2.44f, 1.12f, 4.08f, 1.37f)
                curveToRelative(.46f, .06f, .86f, -.25f, .9f, -.71f)
                curveToRelative(.12f, -1.52f, -.3f, -3.43f, -.5f, -4.28f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.13f, 21.05f)
                curveToRelative(1.65f, .63f, 3.68f, .84f, 4.87f, .91f)
                arcToRelative(.9f, .9f, 0f, false, false, .7f, -.26f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.99f, 5.52f)
                arcToRelative(20.83f, 20.83f, 0f, false, true, 3.15f, 4.5f)
                arcToRelative(.8f, .8f, 0f, false, true, -.68f, 1.13f)
                curveToRelative(-1.17f, .1f, -2.5f, .02f, -3.9f, -.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.57f, 11.14f)
                curveToRelative(.24f, .52f, 1.12f, 2.44f, 1.37f, 4.08f)
                curveToRelative(.04f, .3f, -.08f, .59f, -.31f, .75f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f, 4.93f)
                arcToRelative(10f, 10f, 0f, false, false, -.67f, 13.4f)
                curveToRelative(.35f, .43f, .96f, .4f, 1.17f, -.12f)
                curveToRelative(.69f, -1.71f, 1.07f, -5.07f, 1.07f, -6.71f)
                curveToRelative(1.34f, .45f, 3.1f, .9f, 4.88f, .62f)
                arcToRelative(.85f, .85f, 0f, false, false, .48f, -.24f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.52f, 17.99f)
                curveToRelative(1.05f, .95f, 2.91f, 2.42f, 4.5f, 3.15f)
                arcToRelative(.8f, .8f, 0f, false, false, 1.13f, -.68f)
                curveToRelative(.2f, -2.34f, -.33f, -5.3f, -1.57f, -8.28f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.35f, 2.68f)
                arcToRelative(10f, 10f, 0f, false, true, 9.98f, 1.58f)
                curveToRelative(.43f, .35f, .4f, .96f, -.12f, 1.17f)
                curveToRelative(-1.5f, .6f, -4.3f, .98f, -6.07f, 1.05f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.HopOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HopOff: ImageVector
    @Composable get() = HopOffDefinition.asImageVector()
