package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 11.693f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 22f)
                lineToRelative(-1.875f, -1.875f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcToRelative(9f, 3f, 0f, false, false, 8.697f, 2.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(9f, 3f, 0f, false, false, 9.28f, 2.999f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.DatabaseSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseSearch: ImageVector
    @Composable get() = DatabaseSearchDefinition.asImageVector()
