package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.929f, 14.467f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.929f, 8.923f)
                lineTo(10.546f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.225f, 8.923f)
                lineTo(13.608f, 8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.607f, 15.391f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.849f, 10.547f)
                lineToRelative(.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.849f, 12.843f)
                lineToRelative(.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                curveToRelative(0f, 5f, -3.5f, 7.5f, -7.66f, 8.95f)
                arcToRelative(1f, 1f, 0f, false, true, -.67f, -.01f)
                curveTo(7.5f, 20.5f, 4f, 18f, 4f, 13f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                curveToRelative(2f, 0f, 4.5f, -1.2f, 6.24f, -2.72f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.305f, 10.547f)
                lineToRelative(-.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.305f, 12.843f)
                lineToRelative(-.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.077f, 11.695f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.ShieldCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldCog: ImageVector
    @Composable get() = ShieldCogDefinition.asImageVector()
