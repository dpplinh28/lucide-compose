package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cable") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 19f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 14f)
                verticalLineTo(6.5f)
                arcToRelative(1f, 1f, 0f, false, false, -7f, 0f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, true, -7f, 0f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 21f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 5f)
                verticalLineTo(3f)
            }
}

public val LucideIcons.All.CableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cable: ImageVector
    @Composable get() = CableDefinition.asImageVector()
