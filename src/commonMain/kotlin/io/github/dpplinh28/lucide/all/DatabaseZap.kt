package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseZap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                arcTo(9f, 3f, 0f, false, false, 15f, 21.84f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 5f)
                verticalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                lineTo(18f, 17f)
                horizontalLineTo(22f)
                lineTo(19f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcTo(9f, 3f, 0f, false, false, 14.59f, 14.87f)
            }
}

public val LucideIcons.All.DatabaseZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseZap: ImageVector
    @Composable get() = DatabaseZapDefinition.asImageVector()
