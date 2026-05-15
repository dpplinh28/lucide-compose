package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("University") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.143f, -.359f)
                lineTo(13.143f, 2.36f)
                arcToRelative(2f, 2f, 0f, false, false, -2.286f, -.001f)
                lineTo(6.143f, 5.64f)
                arcTo(2f, 2f, 0f, false, true, 5f, 6f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.UniversityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.University: ImageVector
    @Composable get() = UniversityDefinition.asImageVector()
