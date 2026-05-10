package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("School") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 4.933f)
                verticalLineTo(21f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 6f)
                lineToRelative(7.106f, -3.79f)
                arcToRelative(2f, 2f, 0f, false, true, 1.788f, 0f)
                lineTo(20f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6f, 11f)
                lineToRelative(-3.52f, 2.147f)
                arcToRelative(1f, 1f, 0f, false, false, -.48f, .854f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -.48f, -.853f)
                lineTo(18f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 4.933f)
                verticalLineTo(21f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.SchoolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.School: ImageVector
    @Composable get() = SchoolDefinition.asImageVector()
