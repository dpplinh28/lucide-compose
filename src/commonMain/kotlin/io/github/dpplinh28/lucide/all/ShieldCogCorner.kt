package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldCogCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 22f)
                curveToRelative(-3.806f, -1.45f, -7f, -3.966f, -7f, -9f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                curveToRelative(2f, 0f, 4.5f, -1.2f, 6.24f, -2.72f)
                arcToRelative(1.17f, 1.17f, 0f, false, true, 1.52f, 0f)
                curveTo(14.51f, 3.81f, 17f, 5f, 19f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.923f, 16.547f)
                lineTo(14f, 16.164f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.923f, 18.843f)
                lineToRelative(-.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.547f, 14.923f)
                lineTo(16.164f, 14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.547f, 20.467f)
                lineToRelative(-.383f, .924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.843f, 14.923f)
                lineToRelative(.383f, -.923f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.225f, 21.391f)
                lineToRelative(-.382f, -.924f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.467f, 16.547f)
                lineToRelative(.923f, -.383f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.467f, 18.843f)
                lineToRelative(.923f, .383f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.695f, 17.695f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.ShieldCogCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldCogCorner: ImageVector
    @Composable get() = ShieldCogCornerDefinition.asImageVector()
