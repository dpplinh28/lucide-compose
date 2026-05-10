package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Biohazard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f, 11.9f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.7f, 3.4f)
                curveToRelative(-.9f, 2.5f, 0f, 5.2f, 2.2f, 6.7f)
                curveTo(6.5f, 9f, 3.7f, 9.6f, 2f, 11.6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.9f, 10.1f)
                lineToRelative(1.4f, .8f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.3f, 3.4f)
                curveToRelative(.9f, 2.5f, 0f, 5.2f, -2.2f, 6.7f)
                curveToRelative(2.4f, -1.2f, 5.2f, -.6f, 6.9f, 1.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.1f, 10.1f)
                lineToRelative(-1.4f, .8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.7f, 20.8f)
                curveToRelative(-2.6f, -.4f, -4.6f, -2.6f, -4.7f, -5.3f)
                curveToRelative(-.2f, 2.6f, -2.1f, 4.8f, -4.7f, 5.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 13.9f)
                verticalLineToRelative(1.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f, 5.4f)
                curveToRelative(-1f, -.2f, -2f, -.2f, -3f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 16.4f)
                curveToRelative(.7f, -.7f, 1.2f, -1.6f, 1.5f, -2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.5f, 13.9f)
                curveToRelative(.3f, .9f, .8f, 1.8f, 1.5f, 2.5f)
            }
}

public val LucideIcons.All.BiohazardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Biohazard: ImageVector
    @Composable get() = BiohazardDefinition.asImageVector()
