package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 21f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 4f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 9f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 20f)
                lineToRelative(1.25f, -2.5f)
                lineTo(18f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14f, 4f)
                lineToRelative(1.25f, 2.5f)
                lineTo(18f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 21f)
                lineToRelative(-3f, -6f)
                lineToRelative(1.5f, -3f)
                horizontalLineTo(22f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 3f)
                lineToRelative(-3f, 6f)
                lineToRelative(1.5f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20f, 10f)
                lineToRelative(-1.5f, 2f)
                lineToRelative(1.5f, 2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(3.64f, 18.36f)
                lineToRelative(.7f, -.7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.34f, 6.34f)
                lineToRelative(-.7f, -.7f)
            }
}

public val LucideIcons.All.SunSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunSnow: ImageVector
    @Composable get() = SunSnowDefinition.asImageVector()
