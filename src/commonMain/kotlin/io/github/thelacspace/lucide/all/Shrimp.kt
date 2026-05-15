package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrimp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                curveToRelative(.5f, -.5f, 1.12f, -1f, 2.5f, -1f)
                curveToRelative(-1.38f, 0f, -2f, -.5f, -2.5f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                arcToRelative(3.28f, 3.28f, 0f, false, true, -3.227f, 1.798f)
                lineToRelative(-6.17f, -.561f)
                arcTo(2.387f, 2.387f, 0f, true, false, 4.387f, 8f)
                horizontalLineTo(15.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 13f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -5f)
                horizontalLineTo(12f)
                arcToRelative(7f, 7f, 0f, false, true, -7f, -7f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 8f)
                arcToRelative(8.5f, 8.5f, 0f, false, true, 0f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 16f)
                curveToRelative(2f, 0f, 4.5f, -4f, 4f, -6f)
            }
}

public val LucideIcons.All.ShrimpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrimp: ImageVector
    @Composable get() = ShrimpDefinition.asImageVector()
