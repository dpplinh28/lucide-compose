package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NonBinary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 4f)
                lineToRelative(7f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.5f, 8f)
                lineToRelative(7f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, 10.0f, 0f)
                arcToRelative(5.0f, 5.0f, 0f, true, false, -10.0f, 0f)
            }
}

public val LucideIcons.All.NonBinaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NonBinary: ImageVector
    @Composable get() = NonBinaryDefinition.asImageVector()
