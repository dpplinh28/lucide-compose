package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.82f, 16.12f)
                curveToRelative(1.69f, .6f, 3.91f, .79f, 5.18f, .85f)
                curveToRelative(.55f, .03f, 1f, -.42f, .97f, -.97f)
                curveToRelative(-.06f, -1.27f, -.26f, -3.5f, -.85f, -5.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.5f, 6.5f)
                curveToRelative(1.64f, 0f, 5f, -.38f, 6.71f, -1.07f)
                curveToRelative(.52f, -.2f, .55f, -.82f, .12f, -1.17f)
                arcTo(10f, 10f, 0f, false, false, 4.26f, 18.33f)
                curveToRelative(.35f, .43f, .96f, .4f, 1.17f, -.12f)
                curveToRelative(.69f, -1.71f, 1.07f, -5.07f, 1.07f, -6.71f)
                curveToRelative(1.34f, .45f, 3.1f, .9f, 4.88f, .62f)
                arcToRelative(.88f, .88f, 0f, false, false, .73f, -.74f)
                curveToRelative(.3f, -2.14f, -.15f, -3.5f, -.61f, -4.88f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.62f, 16.95f)
                curveToRelative(.2f, .85f, .62f, 2.76f, .5f, 4.28f)
                arcToRelative(.77f, .77f, 0f, false, true, -.9f, .7f)
                arcToRelative(16.64f, 16.64f, 0f, false, true, -4.08f, -1.36f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.13f, 21.05f)
                curveToRelative(1.65f, .63f, 3.68f, .84f, 4.87f, .91f)
                arcToRelative(.9f, .9f, 0f, false, false, .96f, -.96f)
                arcToRelative(17.68f, 17.68f, 0f, false, false, -.9f, -4.87f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.94f, 15.62f)
                curveToRelative(.86f, .2f, 2.77f, .62f, 4.29f, .5f)
                arcToRelative(.77f, .77f, 0f, false, false, .7f, -.9f)
                arcToRelative(16.64f, 16.64f, 0f, false, false, -1.36f, -4.08f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.99f, 5.52f)
                arcToRelative(20.82f, 20.82f, 0f, false, true, 3.15f, 4.5f)
                arcToRelative(.8f, .8f, 0f, false, true, -.68f, 1.13f)
                curveToRelative(-2.33f, .2f, -5.3f, -.32f, -8.27f, -1.57f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f, 4.93f)
                lineTo(3f, 3f)
                arcToRelative(.7f, .7f, 0f, false, true, 0f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.58f, 12.18f)
                curveToRelative(1.24f, 2.98f, 1.77f, 5.95f, 1.57f, 8.28f)
                arcToRelative(.8f, .8f, 0f, false, true, -1.13f, .68f)
                arcToRelative(20.82f, 20.82f, 0f, false, true, -4.5f, -3.15f)
            }
}

public val LucideIcons.All.HopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hop: ImageVector
    @Composable get() = HopDefinition.asImageVector()
