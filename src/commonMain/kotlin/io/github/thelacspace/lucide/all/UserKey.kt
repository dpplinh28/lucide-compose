package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20f, 11f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 21f)
                verticalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                horizontalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, true, 2.072f, .578f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, 8.0f, 0f)
                arcToRelative(4.0f, 4.0f, 0f, true, false, -8.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.UserKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserKey: ImageVector
    @Composable get() = UserKeyDefinition.asImageVector()
