package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandPlatter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.4f, 17.4f)
                lineToRelative(3.2f, -2.8f)
                arcToRelative(2f, 2f, 0f, true, true, 2.8f, 2.9f)
                lineToRelative(-3.6f, 3.3f)
                curveToRelative(-.7f, .8f, -1.7f, 1.2f, -2.8f, 1.2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2.1f, -.4f, -2.8f, -1.2f)
                lineToRelative(-1.302f, -1.464f)
                arcTo(1f, 1f, 0f, false, false, 6.151f, 19f)
                horizontalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 4f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 14f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.HandPlatterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandPlatter: ImageVector
    @Composable get() = HandPlatterDefinition.asImageVector()
