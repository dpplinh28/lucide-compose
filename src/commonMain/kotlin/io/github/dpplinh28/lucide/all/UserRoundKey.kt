package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 11f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 13f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                arcToRelative(8f, 8f, 0f, false, true, 12.868f, -6.349f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.UserRoundKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundKey: ImageVector
    @Composable get() = UserRoundKeyDefinition.asImageVector()
